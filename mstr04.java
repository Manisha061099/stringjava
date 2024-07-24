
 class mstr04 {

    int i;
    private mstr04(){
        i = 5;
        System.out.println("constructor is called");
    }
public static void main(String[] args) {
    mstr04 obj=new mstr04();
    System.out.println("value of i is : "+ obj.i);
    
}
}
