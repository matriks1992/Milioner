package Milioner_igrica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Grafika extends JFrame {

	private JPanel contentPane;
	private JButton prviOdg, drugiOdg, treciOdg, cetvrtiOdg;
	private JTextPane textPane;
	private List<Pitanja> lista = new LinkedList<Pitanja>();
	private Pitanja p;
	private int zaIzbacivanje;
	private int counter = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafika frame = new Grafika();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Grafika() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));

		textPane = new JTextPane();
		contentPane.add(textPane);

		JPanel panel = new JPanel();
		contentPane.add(panel);
		GridLayout gbl_panel = new GridLayout(2, 2);
		panel.setLayout(gbl_panel);

		prviOdg = new JButton();
		panel.add(prviOdg);

		drugiOdg = new JButton();
		panel.add(drugiOdg);

		treciOdg = new JButton();
		panel.add(treciOdg);

		cetvrtiOdg = new JButton();
		panel.add(cetvrtiOdg);

		prviOdg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String odgovor = prviOdg.getText();
				String tacan = p.getPrviOdg();
				if (odgovor.equals(tacan)) {
					prviOdg.setBackground(Color.GREEN);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					proveriKraj();
					lista.remove(zaIzbacivanje);
					dovuci();
				} else {
					prviOdg.setBackground(Color.RED);
					prviOdg.setEnabled(false);
					drugiOdg.setEnabled(false);
					treciOdg.setEnabled(false);
					cetvrtiOdg.setEnabled(false);
				}
			}

		});
		drugiOdg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String odgovor = drugiOdg.getText();
				String tacan = p.getPrviOdg();
				if (odgovor.equals(tacan)) {
					drugiOdg.setBackground(Color.GREEN);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					proveriKraj();
					lista.remove(zaIzbacivanje);
					dovuci();
				} else {
					drugiOdg.setBackground(Color.RED);
					prviOdg.setEnabled(false);
					drugiOdg.setEnabled(false);
					treciOdg.setEnabled(false);
					cetvrtiOdg.setEnabled(false);
				}
			}
		});
		treciOdg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String odgovor = treciOdg.getText();
				String tacan = p.getPrviOdg();
				if (odgovor.equals(tacan)) {
					treciOdg.setBackground(Color.GREEN);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					proveriKraj();
					lista.remove(zaIzbacivanje);
					dovuci();
				} else {
					treciOdg.setBackground(Color.RED);
					prviOdg.setEnabled(false);
					drugiOdg.setEnabled(false);
					treciOdg.setEnabled(false);
					cetvrtiOdg.setEnabled(false);
				}
			}
		});
		cetvrtiOdg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String odgovor = cetvrtiOdg.getText();
				String tacan = p.getPrviOdg();
				if (odgovor.equals(tacan)) {
					cetvrtiOdg.setBackground(Color.GREEN);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					proveriKraj();
					lista.remove(zaIzbacivanje);
					dovuci();
				} else {
					cetvrtiOdg.setBackground(Color.RED);
					prviOdg.setEnabled(false);
					drugiOdg.setEnabled(false);
					treciOdg.setEnabled(false);
					cetvrtiOdg.setEnabled(false);
				}
			}
		});

		
		lista.add(new Pitanja(" Ko je porazen u bici kod Vaterloa ", "Napoleon", "Vilijam VII", "Petar I Karadjordjevic",
				"J.F. Kenedi"));
		lista.add(new Pitanja(" Osim pasa koga jos dresiraju da pronalazi Tartufe", "Svinje", "Magarce", "Konje",
				"Macke"));
		lista.add(new Pitanja(" Versajskim mirom je zavrsen...? ", "I Sv. Rat", "II Sv. Rat", "Srpsko-Turski ratovi",
				"II Balkanski rat"));
		lista.add(new Pitanja(" Ko je napisao “Gorski vjenac”? ", "Petar II Petrovic", "Dositej Obradovic", "Vuk Stefanovic Karadzic",
				"Tvrtko I Kotromanic"));
		lista.add(new Pitanja(" Koju vrstu municije koristi top? ", "Granata", "Metak", "Topovsko djule",
				"Protiv-tenkovsku minu"));
		lista.add(new Pitanja(" Nastavi niz 1,4,9,16,25…? ", "36", "75", "42",
				"101"));
		lista.add(new Pitanja(" Ko je pronasao X- zrake?", "Vilhelm Rendgen", "Nikola Tesla", "Albert Ajnstajn",
				"Milutin Milankovic"));
		lista.add(new Pitanja(" U kojoj zemlji je napravljen prvi kisobran na zatvaranje?(", "Engleska", "Kina", "Venecuela",
				"Amerika"));
		lista.add(new Pitanja(" U trkama pasa, psi jure za...? ", "Zecom", "Lutkom", "Konjem",
				"Zenom"));
		lista.add(new Pitanja(" U koojoj drzavi je mesto Sengen", "Luksemburg", "Kina", "Japan",
				"Holandija"));
		lista.add(new Pitanja(" Tak je stap za...? ", "Bilijar", "Polo", "Golf",
				"Kriket"));
		lista.add(new Pitanja(" Koliko jedinjenja ima Periodni sistem elemenata", "Nijedan", "1", "3",
				"7"));
		lista.add(new Pitanja(" Nekada su bili Popecitelji, a danas..? ", "Ministri", "Bankari", "Sluzbenici",
				"Advokati"));
		lista.add(new Pitanja(" Koje ostrvo od Italije razdvaja Ligursko more", "Korzika", "Sicilija", "Skiatos",
				"Kapri"));
		lista.add(new Pitanja(" Glavni grad Perua je... ? ", "Lima", "Brcko", "Rio",
				"Veles"));
		lista.add(new Pitanja(" Kako se zove mitolosko bice koje je spoj Lava i  Orla ", "Grifon", "Himera", "Meduza",
				"Kerber"));
		lista.add(new Pitanja(" Sta je Verenikina kosa? ", "Sazvezdje", "Planina", "Reka",
				"Planeta"));
		lista.add(new Pitanja(" CH je medjunarodna registracijska oznaka za koju drzavu?", "Svajcarska", "Kina", "Norveska",
				"Island"));
		lista.add(new Pitanja(" Koji je francuski grad prvi do Pariza po broju stanovnika?", "Marsej", "Bordo", "Monako",
				"Lion"));
		lista.add(new Pitanja(" Koje je more najvece na svetu?", "Sredozemno", "Juzno-kinesko more", "Jonsko more",
				"Mrtvo more"));
		lista.add(new Pitanja(" Koji je sultan vladao kad je 'Bosna saptom pala'?(", "Mehmed II Osvajac", "Murat", "Bajazit",
				"Jakob"));
		lista.add(new Pitanja(" Ko je napravio operu Carmen?(", "Zorz Bize", "Stevan Mokranjac", "Sebastijan Bah",
				"Amadeus Mocart"));
		lista.add(new Pitanja(" Koji trener je najtrofejniji u istoriji KK''Partizan''-a", "Dusko Vujosevic", "Zeljko Obradovic", "Dusan Ivkovic",
				"Vlada Jovanovic"));
		lista.add(new Pitanja(" Azbest je materijal od kog se siju odela za...?", "Vatrogasce", "Hitnu Pomoc", "Policiju",
				"Ronioce"));
		lista.add(new Pitanja("Termos je napravljen od...", "Plastika i stiropor", "Koza i Metal", "Plastika i Guma",
				"Plastika i staklo"));
		lista.add(new Pitanja("Metal postaje savitljiv ako se ...?", "Zagreje na visokoj temperaturi", "Naglo Ohladi", "Izlozi vazduhu",
				"Nista od navedenog"));
		lista.add(new Pitanja(" Koji narod je prvi poceo da koristi metalni mac", "Rimljani", "Turci", "Egipcani",
				"Bavarci"));
		lista.add(new Pitanja(" Kako se zove osoba koja jezicno-stilski uredjuje rukopis", "Lektor", "Urednik", "Recenzant",
				"Mentor"));
		dovuci();
	}

	private void proveriKraj() {
		if (++counter == 15) {
			prviOdg.setEnabled(false);
			drugiOdg.setEnabled(false);
			treciOdg.setEnabled(false);
			cetvrtiOdg.setEnabled(false);
		}

	}

	void dovuci() {
		prviOdg.setBackground(new JButton().getBackground());
		drugiOdg.setBackground(new JButton().getBackground());
		treciOdg.setBackground(new JButton().getBackground());
		cetvrtiOdg.setBackground(new JButton().getBackground());
		zaIzbacivanje = (int) (Math.random()*lista.size());
		p = lista.get(zaIzbacivanje);
		textPane.setText(p.getPitanje());
		int randAns = (int) (Math.random() * 4);
		if(randAns == 0){
			prviOdg.setText(p.getPrviOdg());
			drugiOdg.setText(p.getDrugiOdg());
			treciOdg.setText(p.getTreciOdg());
			cetvrtiOdg.setText(p.getCetvrtiOdg());
		}
		else if (randAns == 1){
			drugiOdg.setText(p.getPrviOdg());
			treciOdg.setText(p.getDrugiOdg());
			cetvrtiOdg.setText(p.getTreciOdg());
			prviOdg.setText(p.getCetvrtiOdg());
		}
		else if (randAns == 2){
			treciOdg.setText(p.getPrviOdg());
			cetvrtiOdg.setText(p.getDrugiOdg());
			prviOdg.setText(p.getTreciOdg());
			drugiOdg.setText(p.getCetvrtiOdg());
		}
		else{
			cetvrtiOdg.setText(p.getPrviOdg());
			treciOdg.setText(p.getDrugiOdg());
			drugiOdg.setText(p.getTreciOdg());
			prviOdg.setText(p.getCetvrtiOdg());
		}
		                 
			
			
		
	}

}
