class GeometricObject{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    private String toString;
    public GeometricObject(){
       dateCreated = new java.util.Date();
    }
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return true;
    }
    public void setColor(String newColor){
        newColor = color;
    }
    public void setFilled(boolean newFilled){
        newFilled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String getToString(){
        return toString;
    }


}
