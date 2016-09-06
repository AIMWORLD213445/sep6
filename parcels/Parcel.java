class Parcel {
  public int mHeight;
  public int mWidth;
  public int mLength;
  public int mVolume;
  public int mWeight;
  public String mDelivery;
  public int mDistance;
  public int mPrice;

  public Parcel(int height, int width, int length, int weight, String delivery, int distance) {
    mHeight = height;
    mWidth = width;
    mLength = length;
    mVolume = 0;
    mWeight = weight;
    mDelivery = delivery;
    mDistance = distance;
    mPrice = 0;
  }

  public void calcVolume() {
    mVolume = mHeight * mWidth * mLength;
  }

  public void costToShip() {
    if (mDelivery.equals("expedited")) {
      mPrice = 25 + (mVolume / 4) + (mWeight * (mDistance / 1000));
    } else if (mDelivery.equals("standard")) {
      mPrice = (mVolume / 4) + (mWeight * (mDistance / 1000)) + 5;
    } else if (mDelivery.equals("overnight")) {
      mPrice = (mVolume / 4 ) + (mWeight * (mDistance / 1000)) + 30;
    } else {
      System.out.println("Sorry, we didn't get that request. Please choose 'standard', 'expedited', or 'overnight'");
    }
  }
}
