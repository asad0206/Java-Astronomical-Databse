import java.util.Map;

public class Asteroids extends AstronomicalObjects{

    private Double orbitalPeriod = null;
    private Double size = null;

    public void setSize(Double size) {
        this.size = size;
    }

    public void setOrbitalPeriod(Double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    @Override
    public String getInformation(){
        SqlQueries queryObject = new SqlQueries("Select information from asteroids where name = '" + super.getName() + "';");
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

        SqlQueries queryObject = new SqlQueries("Select type from asteroids where name = '" + super.getName() +"';");
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
        SqlQueries sqlQueries = new SqlQueries("Select * from asteroids where name = '" + name + "';");
        return sqlQueries.entryExists();
    }

    public Double getOrbitalPeriod(){
        SqlQueries queryObject = new SqlQueries("Select orbitalperiod from asteroids where name = '" + super.getName() + "';");
        Map<String, Object> row = queryObject.getResult();
        for(String object: row.keySet()){
            if("orbitalperiod".equals(object)){
                this.setOrbitalPeriod((Double)row.get(object));
            }
        }
        return orbitalPeriod;
    }

    public Double getSize(){
        SqlQueries queryObject = new SqlQueries("Select * from asteroids where name = '" + getName() + "';");
        Map<String, Object> row = queryObject.getResult();
        for(String object: row.keySet()){
            if("size".equals(object)){
                this.setSize((Double) row.get(object));
            }
        }
        return size;
    }

}
