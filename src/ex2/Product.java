package ex2;

public class Product {
    private String codeProduct;
    private String nameProduct;
    private int numberOfProducts = 1;
    private double priceProduct;
    private double promotionProduct = 0.0;

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public double getPromotionProduct() {
        return promotionProduct;
    }

    public void setPromotionProduct(double promotionProduct) {
        this.promotionProduct = promotionProduct;
    }

    public Product () {
    }

    public Product (String codeProduct,String nameProduct,double priceProduct){
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public Product(String codeProduct, String nameProduct, int numberOfProducts, double priceProduct, double promotionProduct) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.numberOfProducts = numberOfProducts;
        this.priceProduct = priceProduct;
        this.promotionProduct = promotionProduct;
    }
    public double getPromotion() {
        double T;
        if (numberOfProducts >= 2) {
            return T = numberOfProducts * priceProduct * promotionProduct/100;
        } else {
            return T = 0;
        }
    }
    public double bill2() {
        double t = getPromotion();
        return (this.numberOfProducts * this.priceProduct - t);
    }
    public double bill1() {
        return this.numberOfProducts * this.priceProduct;
    }
}
