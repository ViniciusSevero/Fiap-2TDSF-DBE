package br.com.fiap.view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import br.com.fiap.bo.PratoBOStub;
import br.com.fiap.bo.PratoBOStub.Buscar;
import br.com.fiap.bo.PratoBOStub.BuscarResponse;
import br.com.fiap.bo.PratoBOStub.Cadastrar;
import br.com.fiap.bo.PratoBOStub.Prato;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Tela {

	protected Shell shell;
	private Text txtNome;
	private Text txtDescricao;
	private Text txtPreco;
	private Text txtCodigo;
	private Text txtNomeBusca;
	private Text txtDescricaoBusca;
	private Text txtPrecoBusca;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Tela window = new Tela();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(452, 300);
		shell.setText("SWT Application");
		
		txtNome = new Text(shell, SWT.BORDER);
		txtNome.setBounds(10, 40, 158, 21);
		
		Label lblNome = new Label(shell, SWT.NONE);
		lblNome.setBounds(10, 19, 55, 15);
		lblNome.setText("Nome");
		
		Label lblDescricao = new Label(shell, SWT.NONE);
		lblDescricao.setBounds(10, 71, 55, 15);
		lblDescricao.setText("Descri\u00E7\u00E3o");
		
		txtDescricao = new Text(shell, SWT.BORDER);
		txtDescricao.setBounds(10, 92, 158, 21);
		
		Label lblPreco = new Label(shell, SWT.NONE);
		lblPreco.setBounds(10, 131, 55, 15);
		lblPreco.setText("Pre\u00E7o");
		
		txtPreco = new Text(shell, SWT.BORDER);
		txtPreco.setBounds(10, 156, 158, 21);
		
		Button btnEnviar = new Button(shell, SWT.NONE);
		btnEnviar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageBox mb = new MessageBox(shell,SWT.OK|SWT.CANCEL);
				mb.setMessage("Deseja realmente cadastrar o produto?");
				int result = mb.open();
				if(result == SWT.OK){					
					try {
						PratoBOStub stub = new PratoBOStub();
						Cadastrar params = new Cadastrar();
						Prato prato = new Prato();
						prato.setDescricao(txtDescricao.getText());
						prato.setNome(txtNome.getText());
						prato.setPreco(Float.parseFloat(txtPreco.getText()));
						
						params.setPrato(prato);
						
						stub.cadastrar(params);
						MessageBox mb2 = new MessageBox(shell,SWT.OK);
						mb2.setMessage("Produto cadastrado com sucesso!");
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Erro ao cadastrar prato");
						ex.printStackTrace();
					}
				}
			}
		});
		btnEnviar.setBounds(10, 193, 75, 25);
		btnEnviar.setText("Enviar");
		
		Label lblCodigo = new Label(shell, SWT.NONE);
		lblCodigo.setBounds(195, 43, 55, 15);
		lblCodigo.setText("C\u00F3digo");
		
		txtCodigo = new Text(shell, SWT.BORDER);
		txtCodigo.setBounds(269, 40, 76, 21);
		
		Button btnBuscar = new Button(shell, SWT.NONE);
		btnBuscar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try{
					PratoBOStub bo = new PratoBOStub();
					Buscar params = new Buscar();
					params.setCodigo(Integer.parseInt(txtCodigo.getText()));
					BuscarResponse resp = bo.buscar(params);
					
					txtNomeBusca.setText(resp.get_return().getNome());
					txtDescricaoBusca.setText(resp.get_return().getDescricao());
					txtPrecoBusca.setText(resp.get_return().getPreco()+"");
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		btnBuscar.setBounds(351, 38, 75, 25);
		btnBuscar.setText("Buscar");
		
		Label lblNome_1 = new Label(shell, SWT.NONE);
		lblNome_1.setBounds(195, 92, 55, 15);
		lblNome_1.setText("Nome");
		
		Label lblDescrio = new Label(shell, SWT.NONE);
		lblDescrio.setBounds(195, 131, 55, 15);
		lblDescrio.setText("Descri\u00E7\u00E3o");
		
		Label lblPreo = new Label(shell, SWT.NONE);
		lblPreo.setBounds(195, 172, 55, 15);
		lblPreo.setText("Pre\u00E7o");
		
		txtNomeBusca = new Text(shell, SWT.BORDER);
		txtNomeBusca.setBounds(270, 92, 156, 21);
		
		txtDescricaoBusca = new Text(shell, SWT.BORDER);
		txtDescricaoBusca.setBounds(270, 125, 156, 21);
		
		txtPrecoBusca = new Text(shell, SWT.BORDER);
		txtPrecoBusca.setBounds(270, 166, 156, 21);

		
	}
}
