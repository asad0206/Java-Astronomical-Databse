import java.util.Map;

public class Stars extends AstronomicalObjects{

    private Double size;
    private Double mass;
    private Double distance;

    @Override
    public String getInformation() {
        SqlQueries queryObject = new SqlQueries("Select information from stars where name = '" + super.getName() + "';");
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
        SqlQueries queryObject = new SqlQueries("Select type from stars where name = '" + super.getName() +"';");
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
        SqlQueries sqlQueries = new SqlQueries("Select* from stars where name = '" + name + "';");
        return sqlQueries.entryExists();
    }

    public Double getDistance(){
        SqlQueries queryObject = new SqlQueries("Select * from stars where name = '" + getName() + "';");
        Map<String, Object> row = queryObject.getResult();
        for(String object: row.keySet()){
            if("distance".equals(object)){
                distance = (Double) row.get(object);
            }
        }
        return distance;
    }

    public Double getMass(){
        SqlQueries queryObject = new SqlQueries("Select * from stars where name = '" + getName() + "';");
        Map<String, Object> row = queryObject.getResult();
        for(String object: row.keySet()){
            if("mass".equals(object)){
                mass = (Double) row.get(object);
            }
        }
        return mass;
    }

    public Double getSize(){
        SqlQueries queryObject = new SqlQueries("Select * from stars where name = '" + getName() + "';");
        Map<String, Object> row = queryObject.getResult();
        for(String object: row.keySet()){
            if("size".equals(object)){
                size = (Double) row.get(object);
            }
        }
        return size;
    }
}
