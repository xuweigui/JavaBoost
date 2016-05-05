public class Test {
    public static void main(String[] args) {
        readLine(new String[]{"b,1", "a,4", "b,3", "ddddd,2"});

    }
    private static void readLine(String[] args){
        Set<String> keys = new HashSet<>();
        Arrays.stream(args)
                .map(s->s.split(","))
                .sorted((o1, o2) -> {
                    int i = o1[0].compareTo(o2[0]);
                    return i == 0? o1[1].compareTo(o2[1]):i;
                })
                .map(s -> {
                    if (keys.contains(s[0])) {
                        return null;
                    } else {
                        keys.add(s[0]);
                        return s;
                    }
                })
                .filter(s -> s != null)
                
                
                
                .map(s-> s[0] + ", " + s[1])
                .forEachOrdered(System.out::println);
    }
}
