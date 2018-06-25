import java.util.Vector;

public class PlotContainer {
	
	private Vector<Plot> plotContainer;
	
	public PlotContainer() {
		this.plotContainer = new Vector<Plot>();
	}
	
	public Vector<Plot> getPlotContainer() {
		return this.plotContainer;
	}

	public void setPlotContainer(Vector<Plot> plotContainer) {
		this.plotContainer = plotContainer;
	}
	
	public int getSize() {
		return this.plotContainer.size();
	}
	
	public void addPlot(Plot plot) {
		this.plotContainer.addElement(plot);
	}
	
	public void printPlots() {
		for(int i = 0; i < this.plotContainer.size(); i++) {
			System.out.println("\nPlot " + (i + 1));
			System.out.println(this.plotContainer.get(i));
		}
	}
}
