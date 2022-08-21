import java.util.Map;

public class Galaxies extends AstronomicalObjects{
    private Double distance = null;

    @Override
    public String getInformation() {
        SqlQueries queryObject = new SqlQueries("Select information from galaxies where name = '" + super.getName() + "';");
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

        SqlQueries queryObject = new SqlQueries("Select type from galaxies where name = '" + super.getName() +"';");
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
        SqlQueries sqlQueries = new SqlQueries("Select * from galaxies where name = '" + name + "';");
        return sqlQueries.entryExists();
    }

    public Double getDistance(){
        SqlQueries queryObject = new SqlQueries("Select * from galaxies where name = '" + getName() + "';");
        Map<String, Object> row = queryObject.getResult();
        for(String object: row.keySet()){
            if("size".equals(object)){
                distance = (Double) row.get(object);
            }
        }
        return distance;
    }
}
