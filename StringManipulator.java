public class StringManipulator{
    public String trimAndConcat(String x, String y){
    String result = x.trim() + y.trim();
    return result;
    }
    public Integer getIndexOrNull(String x, char a){
    
    Integer result = x.indexOf(a);
    return result;
    }
    public Integer getIndexOrNull(String x, String y){
    Integer result = x.indexOf(y);
    return result;
    }
    public String concatSubstring(String x, int i, int j, String y){
    String result = x.substring(i,j);
    String total = result + y;
    return total;
    }
}