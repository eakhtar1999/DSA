class RecentCounter {
    Deque<Integer> q = new ArrayDeque<>();
    int counter;

    public RecentCounter() {
        counter = 0;
    }
    
    public int ping(int t) {
        q.addLast(t);
        counter = 0;
        int thresold= t-3000;
        for(int n :q){
            if(n >= thresold){
                counter++;
            }else{
                q.removeFirst();
            }
        }
        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */