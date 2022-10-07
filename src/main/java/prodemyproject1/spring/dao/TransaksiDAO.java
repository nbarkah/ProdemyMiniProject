package prodemyproject1.spring.dao;

import java.util.List;

import org.springframework.ui.Model;

import prodemyproject1.spring.model.Transaksi;

public interface TransaksiDAO {
	public boolean NewTransaction(int personId, String bukuKode, String tpinjam, Model model);
	public void UpdateTransaction(int transaksiId, String tbalik);
	public void UpdateDenda(int transaksiId, int denda);
	public Transaksi SelectTransaction(int transaksiId);
	public List<Transaksi> SelectAllTransaction();
}
