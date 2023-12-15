class Solution {
      public String destCity(List<List<String>> paths) {
    Set<String> startCities = new HashSet<>();
        Set<String> allCities = new HashSet<>();

        // Extract start and destination cities
        for (List<String> path : paths) {
            startCities.add(path.get(0));
            allCities.add(path.get(0));
            allCities.add(path.get(1));
        }

        // Find the destination city
        for (String city : allCities) {
            if (!startCities.contains(city)) {
                return city;
            }
        }

        return ""; // Default return if no destination city is found
    }
}