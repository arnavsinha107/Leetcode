class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;

    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        
        if(!map.containsKey(key)) map.put(key,new TreeMap<>());
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            TreeMap<Integer,String> tm = map.get(key);
            
            Integer t=tm.floorKey(timestamp);
            if(t == null) return "";
            return tm.get(t);
            

        }
        else{
            return "";
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */