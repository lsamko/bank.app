package bankAccountApp;

public interface IBaseRate {
    // Write the method that returns the base rate
    default double getBaseRate(){
        return 2.5;
    }
}
