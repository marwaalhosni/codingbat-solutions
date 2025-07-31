public class UserCompare {
    public int userCompare(String aName, int aId, String bName, int bId) {
        int nameCompare = aName.compareTo(bName);
        if (nameCompare != 0) {
            return nameCompare < 0 ? -1 : 1;
        }
        // names are the same, compare IDs
        if (aId < bId) return -1;
        if (aId > bId) return 1;
        return 0;
    }
}
