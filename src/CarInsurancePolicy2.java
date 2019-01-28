public class CarInsurancePolicy2 {
    public class CreatePolicies
    {
        public static void main(String[] args)
        {
            CarInsurancePolicy first = new CarInsurancePolicy(123);
            CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
            CarInsurancePolicy thrid = new CarInsurancePolicy(789, 12, "Newcastle");

            first.display();
            second.display();
            thrid.display();
        }
    }
}
