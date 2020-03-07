class Demo {
    public static void main (String []args){
        ByTwos twos = new ByTwos();
        ByThrees threes = new ByThrees();
        Series ob;

        for (int i =0; i<5; i++){
            ob=twos;
            System.out.println("Kolejna wartość sekwencji ByTwos:"+ob.getNext());

            ob=threes;
            System.out.println("Kolejna wartość sekwencji ByThrees:"+ob.getNext());
        }
    }
}
