package ProblemsDay_126;

public class DesignBrowserHistory {

    //https://leetcode.com/problems/design-browser-history/?envType=problem-list-v2&envId=doubly-linked-list
    class BrowserHistory {
        private String[] history;
        int current; // Index of the current page
        int end;     // Index of the last valid page in the current history branch (inclusive)
        int maxSize; // Maximum capacity

        public BrowserHistory(String homepage) {
            maxSize = 5001;
            history = new String[maxSize];
            history[0] = homepage;
            current = 0;
            end = 0;
        }

        public void visit(String url) {
            current++;
            history[current] = url;
            end = current;
        }

        public String back(int steps) {
            // You can also rewrite this without Math.max if desired, similar to forward
            // if (current - steps < 0) {
            //     current = 0;
            // } else {
            //     current -= steps;
            // }
            current = Math.max(0, current - steps); // Keeping Math.max for conciseness here for back()
            return history[current];
        }

        public String forward(int steps) {
            // Logic without Math.min():
            int potentialNewCurrent = current + steps;
            if (potentialNewCurrent > end) {
                // If trying to move beyond 'end', just go to 'end'
                current = end;
            } else {
                // Otherwise, move by the specified 'steps'
                current = potentialNewCurrent; // Same as current += steps;
            }
            return history[current];
        }
    }

    public static void main(String[] args) {

    }
}
