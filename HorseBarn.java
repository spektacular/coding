package Horse;

public class HorseBarn {
    /**
     * The spaces in the barn. Each array element holds a
     * reference to the horse
     * that is currently occupying the space. A null value
     * indicates an empty space.
     */
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }

    /**
     * Returns the index of the space that contains the horse
     * with the specified name.
     * Precondition: No two horses in the barn have the same name.
     * 
     * @param name the name of the horse to find
     * @return the index of the space containing the horse with
     *         the specified name; * -1 if no horse with the
     *         specified name is in the barn.
     */
    public int findHorseSpace(String name) {
        /* to be implemented in part (a) */
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null && this.spaces[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Consolidates the barn by moving horses so that
     * the horses are in adjacent spaces, starting at
     * index0, with no empty space between any two horses.
     * Postcondition: The order of the horses is the same as
     * before the consolidation.
     */
    public void consolidate() {
        int numHorses = 0;
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null) {
                numHorses++;
            }
        }
        Horse[] res = new Horse[numHorses];
        for (int i = 0, j = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null) {
                res[j] = this.spaces[i];
                j++;
            }
        }
        this.spaces = res;
    }

    // There may be instance variables, constructors, and methods that not sho
    // n.

    public String toString() {
        String result = "[";
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] == null) {
                result += "null";
            } else {
                result += this.spaces[i].getName();
            }
            if (i < this.spaces.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}