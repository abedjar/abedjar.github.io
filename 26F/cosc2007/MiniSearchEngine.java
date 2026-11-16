import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * COSC2007 - Mini Search Engine starter.
 * Complete only the TODO public methods; keep their signatures unchanged.
 * You may create additional private helpers if useful.
 */
public class MiniSearchEngine {

    private static final Pattern WORD_PATTERN = Pattern.compile("[A-Za-z0-9]+");

    // Maintain both directions; these dictionaries are intentionally provided.
    private final Map<String, Map<String, Integer>> invertedIndex = new HashMap<>();
    private final Map<String, Map<String, Integer>> documentIndex = new HashMap<>();

    /** Add document or completely replace a previous document with this ID. */
    public void addDocument(String id, String content) {
        // TODO: validate inputs; count words; replace old document; update both indexes.
        throw new UnsupportedOperationException("TODO: addDocument");
    }

    /** Return true if a document was found and removed, false otherwise. */
    public boolean removeDocument(String id) {
        // TODO: remove from documentIndex, then clean all inverted-index postings.
        throw new UnsupportedOperationException("TODO: removeDocument");
    }

    /** Return word frequency within document, or zero if absent. */
    public int getWordFrequency(String word, String documentId) {
        // TODO: validate documentId and word; accept one normalized word only.
        throw new UnsupportedOperationException("TODO: getWordFrequency");
    }

    /** Return sorted IDs containing every distinct query term. */
    public List<String> searchAND(String[] queryWords) {
        // TODO: intersection of posting-list document IDs.
        throw new UnsupportedOperationException("TODO: searchAND");
    }

    /** Return sorted IDs containing at least one distinct query term. */
    public List<String> searchOR(String[] queryWords) {
        // TODO: union of posting-list document IDs.
        throw new UnsupportedOperationException("TODO: searchOR");
    }

    /** Rank IDs by descending total frequency; break ties by ascending ID. */
    public List<String> rankDocuments(String[] queryWords) {
        // TODO: compute document scores from postings and sort IDs.
        throw new UnsupportedOperationException("TODO: rankDocuments");
    }

    public int getDocumentCount() {
        // TODO
        throw new UnsupportedOperationException("TODO: getDocumentCount");
    }

    public int getVocabularySize() {
        // TODO
        throw new UnsupportedOperationException("TODO: getVocabularySize");
    }

    // -------- Provided helper methods (you can use these as-is). --------

    /** Reject null or blank document IDs. */
    private static void validateId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Document ID cannot be null or blank.");
        }
    }

    /** Extract lowercase ASCII alphanumeric words; punctuation separates words. */
    private static List<String> tokenize(String text) {
        List<String> words = new ArrayList<>();
        Matcher matcher = WORD_PATTERN.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group().toLowerCase(Locale.ROOT));
        }
        return words;
    }

    /** Count each distinct word's occurrences within content. */
    private static Map<String, Integer> countWords(String content) {
        Map<String, Integer> counts = new HashMap<>();
        for (String word : tokenize(content)) {
            counts.merge(word, 1, Integer::sum);
        }
        return counts;
    }

    /** Tokenize all query items, remove duplicate terms, reject a null query array. */
    private static Set<String> normalizedQueryTerms(String[] queryWords) {
        if (queryWords == null) {
            throw new IllegalArgumentException("Query array cannot be null.");
        }
        Set<String> words = new LinkedHashSet<>();
        for (String item : queryWords) {
            if (item != null) {
                words.addAll(tokenize(item));
            }
        }
        return words;
    }

    /** Convert a set of IDs into a lexicographically ascending List. */
    private static List<String> alphabeticallySorted(Set<String> ids) {
        List<String> result = new ArrayList<>(ids);
        Collections.sort(result);
        return result;
    }
}
