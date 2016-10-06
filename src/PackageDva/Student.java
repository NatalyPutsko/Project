package PackageDva;

public abstract class Student extends Object implements Vidpochinok {
    protected boolean isNeznayeNoviyMaterial=true;
    public void ychitu(){
        isNeznayeNoviyMaterial=false;
        System.out.println("Vuvchiv");
    }
    public abstract void ihatu();
    public abstract void vidpochivatu();


}
