package videostore.horror;

public class Movie {
   enum Category {
      CHILDREN,
      REGULAR,
      NEW_RELEASE
   }
   public static final int CHILDREN = 2;
   public static final int REGULAR = 0;
   public static final int NEW_RELEASE = 1;

   private final String title;
   private final Category priceCode;

   public Movie(String title, Category priceCode) {
      this.title = title;
      this.priceCode = priceCode;
   }

   public Category getPriceCode() {
      return priceCode;
   }

   public String getTitle() {
      return title;
   }

}
