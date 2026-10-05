class TimeMap {
    HashMap<String, List<Pair>> map = new HashMap<>();

    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        List<Pair> list = map.get(key);
        int s = 0;
        int e = list.size() - 1;
        String result = "";
        while(s <= e){
            int m = s + (e - s) / 2;
            if(list.get(m).timestamp <= timestamp){
                result = list.get(m).value;
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return result;
    }
}
class Pair{
    int timestamp;
    String value;

    Pair(int timestamp, String value){
        this.timestamp = timestamp;
        this.value = value;
    }
}
