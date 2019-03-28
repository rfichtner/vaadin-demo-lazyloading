
package software.xdev;

import static java.lang.String.valueOf;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("")
public class VaadinApp extends Composite<VerticalLayout>
{
	
	private final Button btnClickMe = new Button("click me");
	private final Span lbClickCount = new Span("0");
	private final VerticalLayout layout = new VerticalLayout(this.btnClickMe, this.lbClickCount);
	
	private int clickcount = 0;
	
	public VaadinApp()
	{
		
		this.btnClickMe.addClickListener(event -> this.lbClickCount.setText(valueOf(++this.clickcount)));
		
		final List<Person> persons = IntStream.range(0, 10_000).mapToObj(i ->
		{
			final Person p = new Person();
			p.setAge(i + "");
			p.setCity("super city goes here");
			p.setName("This is a great name!");
			return p;
		}).collect(Collectors.toList());
		
		final Grid<Person> grid = new Grid<>(Person.class);
		grid.setItems(persons);
		grid.setSizeFull();
		this.layout.add(grid);
		
		this.getContent().setSizeFull();
		this.layout.setSizeFull();
		
		// set the main Component
		this.getContent().add(this.layout);
		
	}
}
