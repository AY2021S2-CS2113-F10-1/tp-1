package seedu.hdbuy.command;

import seedu.hdbuy.common.QueryKey;

import java.util.HashMap;

public class SortCommand extends Command {
    protected String criteria;

    public SortCommand(String criteria) {
        this.criteria = criteria;
    }

    @Override public void execute(HashMap<QueryKey, String> inputs) {
        System.out.println("SortCommand not implemented");
//        try {
//            switch (criteria) {
//            case "asc":
//
//                break;
//            case "desc":
//
//                break;
//            default:
//                throw new InvalidSortException();
//            }
//            TextUi.showParameters(inputs);
//        } catch (InvalidSortException e) {
//            TextUi.showInvalidSort(criteria, e);
//        }
    }
}