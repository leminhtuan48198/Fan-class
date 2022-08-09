public class Fan {
    private int speed;
    private String speedInString;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        this.speed=1;
        this.speedInString="SLOW";
        this.on=false;
        this.radius=5;
        this.color="blue";
    }

    public String getSpeed() {
        return speedInString;
    }

    public String getSpeedInString() {
        return speedInString;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        switch (speed){
            case 1:
                this.speedInString = "SLOW";
                break;
            case 2:
                this.speedInString = "MEDIUM";
                break;
            case 3:
                this.speedInString = "FAST";
                break;

        }
    }



    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if(this.on){
            return "Fan is on.Speed is "+this.getSpeedInString()+". Color is "+this.getColor()+". Radius is "+this.getRadius();

        }else{
            return "Fan is off."+" Color is "+this.getColor()+". Radius is "+this.getRadius();
        }
    }
}
