public class Rectangle { //khai báo lớp
    private float length = 1.0f;
    private float width = 1.0f;
//Hai thuộc tính riêng, mặc đinh 1.0f
    //private: truy cập từ bên trong
    public Rectangle(float length, float width) { //constructor có tham số
        this.length = length;
        this.width = width;
    }
//Rectangle(): ko làm gì, constructor mặc định

    public Rectangle() {

    }
//Rectangle(): ko làm gì, constructor mặc định


    public float getLength() {
        return length;
    }
//Lấy giá trị lenght và Width
    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }
//Giá trị mới của Length và Width, có thể thay đổi cho giá trị cũ
    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() { //Trả về diện tích HCN
        return length * width;
    }

    public double getPerimeter() { //Trả về chu vi HCN
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}

