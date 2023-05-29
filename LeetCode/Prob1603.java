class ParkingSystem {
    int[] nums;

    public ParkingSystem(int big, int medium, int small) {
        nums = new int[] { 0, big, medium, small };
    }

    public boolean addCar(int carType) {
        return --nums[carType] >= 0;
    }
}