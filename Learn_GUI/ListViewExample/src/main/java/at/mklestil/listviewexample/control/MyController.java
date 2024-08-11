package at.mklestil.listviewexample.control;

import at.mklestil.listviewexample.model.ButtonModel;
import at.mklestil.listviewexample.model.ListViewModel;
import at.mklestil.listviewexample.view.MyButton;
import at.mklestil.listviewexample.view.MyView;

public class MyController {
    private MyView view;

    public MyController(MyView view) {
        this.view = view;

        ListViewModel listViewModel = new ListViewModel(view.getListView());

        for(MyButton myButton : view.getButtons()){
            new ButtonModel(view.getListView(), myButton);
        }

    }
}
