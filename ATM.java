public class ATM {
    public int countBanknotes (int sum) {
        int quantity = 0;
        int[] nominals = new int[] {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i=0;
        while (sum>0) {
            if (sum >= nominals[i]) {
                quantity += sum/nominals[i];
                sum = sum%nominals[i];
            }
            i++;
        }
        return quantity;
    }
}
