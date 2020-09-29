package com.application.views.newproject;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.application.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "new-project", layout = MainView.class)
@PageTitle("New Project")
@CssImport("./styles/views/newproject/new-project-view.css")
@RouteAlias(value = "", layout = MainView.class)
public class NewProjectView extends Div {

    public NewProjectView() {
        setId("new-project-view");

        HorizontalLayout layoutCode = new HorizontalLayout();
        //VerticalLayout layoutFile = new VerticalLayout();
        VerticalLayout layoutTerminal = new VerticalLayout();

        //Label secondLabel = new Label("File.java");
        Label thirdLabel = new Label("Terminal component");

        TextArea codeArea = new TextArea("Code");
        codeArea.getStyle().set("minHeight", "450px");
        codeArea.setHeightFull();
        codeArea.setWidthFull();
        codeArea.setPlaceholder("Write your code here ...");

        TextArea line = new TextArea("Line");
        line.setHeightFull();
        line.setMaxWidth("30px");

        line.setEnabled(false);
        //Button bottomNewFile = new Button("New File", new Icon(VaadinIcon.FILE_ADD));
        NumberField numberField = new NumberField();
        numberField.setValue(1d);
        numberField.setHasControls(true);
        numberField.setMin(1);
        numberField.setMax(10);

        //add(numberField);

        layoutCode.add(line, codeArea);
        layoutTerminal.add(thirdLabel, numberField);


        SplitLayout layout2 = new SplitLayout();
        layout2.setOrientation(SplitLayout.Orientation.VERTICAL);
        layout2.addToPrimary(layoutCode);
        layout2.addToSecondary(layoutTerminal);
        layout2.setSizeFull();
        add(layout2);
    }

    public VerticalLayout getLayoutLine(){
        VerticalLayout layout = new VerticalLayout();


        return layout;
    }

    public VerticalLayout getLayoutCode(){
        VerticalLayout layout = new VerticalLayout();


        return layout;
    }

    public VerticalLayout getLayoutTerminal(){
        VerticalLayout layout = new VerticalLayout();


        return layout;
    }
}
