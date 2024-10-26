package br.edu.iff.jogoforca.dominio.boneco.texto;

import br.edu.iff.bancodepalavras.dominio.letra.texto.LetraTextoFactory;
import br.edu.iff.jogoforca.dominio.boneco.Boneco;

public class BonecoTexto implements Boneco {
	private static BonecoTexto instancia = null;
	
	private BonecoTexto () {
		super();
	}
	
	/**
	 * Cria uma instancia unica de BonecoTexto (Singleton)
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de BonecoTexto
	 */
	private static BonecoTexto soleInstance() {
        if (instancia == null) {
        	instancia = new BonecoTexto();
        }
        return instancia;
    }
	
	/**
	 * Obtem uma instancia unica de BonecoTexto
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de BonecoTexto
	 */
	public static BonecoTexto getSoleInstance() {
		return soleInstance();
	}
	
	@Override
	public Boneco getBoneco() {
		return this.getSoleInstance();
	}
	
	@Override
	public void exibir(Object contexto, int partes) {
		switch (partes) {
			case 0: {
				System.out.print("");
			}
			case 1: {
				System.out.print("cabeça");
				break;
			}
			case 2: {
				System.out.print("cabeça, olho esquerdo");
				break;
			}
			case 3: {
				System.out.print("cabeça, olho esquerdo, olho direito");
				break;
			}
			case 4: {
				System.out.print("cabeça, olho esquerdo, olho direito, nariz");
				break;
			}
			case 5: {
				System.out.print("cabeça, olho esquerdo, olho direito, nariz, boca");
				break;
			}
			case 6: {
				System.out.print("cabeça, olho esquerdo, olho direito, nariz, boca, tronco");
				break;
			}
			case 7: {
				System.out.print("cabeça, olho esquerdo, olho direito, nariz, boca, tronco, braço esquerdo");
				break;
			}
			case 8: {
				System.out.print("cabeça, olho esquerdo, olho direito, nariz, boca, tronco, braço esquerdo, braço direito");
				break;
			}
			case 9: {
				System.out.print("cabeça, olho esquerdo, olho direito, nariz, boca, tronco, braço esquerdo, braço direito, perna esquerda");
				break;
			}
			case 10: {
				System.out.print("cabeça, olho esquerdo, olho direito, nariz, boca, tronco, braço esquerdo, braço direito, perna esquerda, perna direita");
				break;
			}
			default: {
				throw new IllegalArgumentException("Partes devem possuir um numero entre 0 e 10");
			}
		}
	}
}