import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape(){
        points = new ArrayList<>();
    }

    public void addPoint(Point p){
        points.add(p);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public ArrayList<Double> getSides(){
        ArrayList<Double> sides = new ArrayList<Double>();
        int i = 0;
        while(i<points.size()){
            sides.add(points.get(i).findDistance(points.get(i)));
            i++;
        }
        return sides;
    }


    public double calculatePerimeter(){
        ArrayList<Double> sides = getSides();
        int i = 0;
        double sum = 0;
        while(i < sides.size()){
            sum += sides.get(i);
            i++;
        }
        return sum;
    }

    public double findLongestSide(){
        ArrayList<Double> sides = getSides();
        double max = sides.get(0);
        for(int i = 0; i< sides.size(); i++){
          max = Math.max(max, sides.get(0));
        }

        return max;
    }

    public double returnAverageLength(){
        double averageLength = calculatePerimeter()/points.size();

        return averageLength;
    }



}

