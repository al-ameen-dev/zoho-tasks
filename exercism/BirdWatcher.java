class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int[] getLastWeek() {
        return birdsPerDay;
    }
    public int getToday() {
        int[] birdsVisited = getLastWeek();
        return birdsVisited[birdsVisited.length-1];
    }
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]+=1;
    }
    public boolean hasDayWithoutBirds() {
        int[] birdsVisited = getLastWeek();
        for(int i=0;i<birdsVisited.length;i++){
            if(birdsVisited[i] == 0){
                return true;
            }
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int countForDays = 0;
        int limit = 0;
        int[] birdsVisited = getLastWeek();
        if(numberOfDays>birdsVisited.length){
            limit = birdsVisited.length;
        }
        else{
            limit = numberOfDays;
        }
        for(int i=0;i<limit;i++){
            countForDays += birdsVisited[i];
        }
        return countForDays;
    }
    public int getBusyDays() {
        int busyDays = 0;
        int[] birdsVisited = getLastWeek();
        for(int i=0;i<birdsVisited.length;i++){
            if(birdsVisited[i] >= 5){
                 busyDays++;   
            }
        }
        return busyDays;
    }
}