package KSVarietyPack;

public class ProgressBar {

  int iterationMax;
  int finishedIteration = 0;
  long timeBeginning;
  double numeratorHour = 3600_000;

  ProgressBar(int iterationMax) {
    this.iterationMax = iterationMax;
    timeBeginning = System.currentTimeMillis();
  }

  void stepNext() {
    this.finishedIteration++;
    double timeElapsed = (System.currentTimeMillis() - timeBeginning) / numeratorHour;
    double timeLeft = (timeElapsed / finishedIteration) * (iterationMax - finishedIteration);
    double progress = 100 * finishedIteration / (double) iterationMax;
    java.util.Date timeCurrent = new java.util.Date(System.currentTimeMillis());

    System.out.println(
        timeCurrent+"\t"+
        "Iterated: " + finishedIteration + " / " + iterationMax +
            " (" + String.format("%.02f", progress) + "%)" +
            "\t\tElapsed: " + String.format("%.02f", timeElapsed) + " Hr" +
            "\t\tLeft: " + String.format("%.02f", timeLeft) + " Hr"
    );
  }

}