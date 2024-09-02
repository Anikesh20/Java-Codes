import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

 class MeteorScoreCalculator {
    public static void main(String[] args) {
        String referenceSummary = "Scientists have discovered a new species of butterfly in the Amazon rainforest.";
        String generatedSummary = "A new butterfly species was found in the Amazon.";

        double meteorScore = calculateMeteorScore(referenceSummary, generatedSummary);
        System.out.println("METEOR Score: " + meteorScore);
    }

    public static double calculateMeteorScore(String referenceSummary, String generatedSummary) {
        // Preprocess the summaries
        String[] referenceTokens = preprocessSummary(referenceSummary);
        String[] generatedTokens = preprocessSummary(generatedSummary);

        // Calculate unigram precision and recall
        double precision = calculatePrecision(referenceTokens, generatedTokens);
        double recall = calculateRecall(referenceTokens, generatedTokens);

        // Calculate F-mean
        double fMean = calculateFMean(precision, recall);

        // Calculate METEOR score
        double meteorScore = fMean;

        return meteorScore;
    }

    public static String[] preprocessSummary(String summary) {
        // Remove punctuation and convert to lowercase
        String processedSummary = summary.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

        // Tokenize into words
        String[] tokens = processedSummary.split("\\s+");

        return tokens;
    }

    public static double calculatePrecision(String[] referenceTokens, String[] generatedTokens) {
        Set<String> referenceSet = new HashSet<>(Arrays.asList(referenceTokens));
        Set<String> generatedSet = new HashSet<>(Arrays.asList(generatedTokens));

        Set<String> commonTokens = new HashSet<>(referenceSet);
        commonTokens.retainAll(generatedSet);

        double precision = (double) commonTokens.size() / generatedSet.size();
        return precision;
    }

    public static double calculateRecall(String[] referenceTokens, String[] generatedTokens) {
        Set<String> referenceSet = new HashSet<>(Arrays.asList(referenceTokens));
        Set<String> generatedSet = new HashSet<>(Arrays.asList(generatedTokens));

        Set<String> commonTokens = new HashSet<>(referenceSet);
        commonTokens.retainAll(generatedSet);

        double recall = (double) commonTokens.size() / referenceSet.size();
        return recall;
    }

    public static double calculateFMean(double precision, double recall) {
        double alpha = 0.5;
        double fMean = (10 * precision * recall) / ((9 * precision) + recall);
        return fMean;
    }
}