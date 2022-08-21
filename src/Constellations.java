import java.util.Map;

public class Constellations extends AstronomicalObjects{
    private Integer numberOfStars;
    @Override
    public String getInformation() {
        SqlQueries queryObject = new SqlQueries("Select information from constellations where name = '" + super.getName() + "';");
        Map<String, Object> row = queryObject.getResult();
        for(String object: row.keySet()){
            if("information".equals(object)){
                super.setInformation("" + row.get(object));
            }
        }
        return super.getInformation();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getType() {

        SqlQueries queryObject = new SqlQueries("Select type from constellations where name = '" + super.getName() +"';");
        Map<String, Object> row = queryObject.getResult();
        for(String object: row.keySet()){
            if("type".equals(object)){
                super.setType("" + row.get(object));
            }
        }
        return super.getType();
    }

    @Override
    public boolean objectExists(String name) {
        SqlQueries sqlQueries = new SqlQueries("Select * from constellations where name = '" + name + "';");
        return sqlQueries.entryExists();
    }

    public Integer getNumberOfStars(){
        SqlQueries queryObject = new SqlQueries("Select * from constellations where name = '" + super.getName() + "';");
        Map<String, Object> row = queryObject.getResult();
        for(String object: row.keySet()){
            if("numberofstars".equals(object)){
                numberOfStars = (Integer) row.get(object);
            }
        }
        return numberOfStars;
    }
}
