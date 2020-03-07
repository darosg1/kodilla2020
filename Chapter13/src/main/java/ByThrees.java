class ByThrees implements Series{
    int start;
    int val;

    ByThrees(){
        start = 0;
        val = 0;
    }
    public int getNext(){
        val+=3;
        return val;
    }
}
