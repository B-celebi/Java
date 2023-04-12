public class ChronometreThreading implements Runnable{
    private String name;
    ChronometreThreading(String name){   //Constructor and setter
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name +". process is starting...");
        try{
        for (int i=0; i<=10; i++){
            System.out.println(name +" "+i+".");
            Thread.sleep(1000);
        }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}
