import abstract_class.funcMaster;

public class exit extends funcMaster {

    public exit(String selection) {
        super.selection = selection;
    }

    @Override
    public void run() {
        System.out.println("Exiting");
        System.exit(0);
    }

    @Override
    public String getSelection() {
        // TODO Auto-generated method stub
        return null;
    }
}
