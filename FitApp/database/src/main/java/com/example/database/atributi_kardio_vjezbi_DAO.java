package com.example.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.core.entities.AtributiKardioVjezbi;

@Dao
public interface atributi_kardio_vjezbi_DAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public long[] create(AtributiKardioVjezbi... atributiKardioVjezbis);

    @Update
    public void update(AtributiKardioVjezbi... atributiKardioVjezbis);

    @Delete
    public void delete(AtributiKardioVjezbi... atributiKardioVjezbis);

    @Query("SELECT * FROM atributi_kardio_vjezbi WHERE korisnikVjezbaId=:korisnikVjezbaId")
    public LiveData<AtributiKardioVjezbi> readByKorisnikVjezba(String korisnikVjezbaId);

    @Query("SELECT * FROM atributi_kardio_vjezbi WHERE id=:Id")
    public LiveData<AtributiKardioVjezbi> readById(String Id);

    @Query("INSERT INTO atributi_kardio_vjezbi (korisnikVjezbaId) VALUES (:korisnikVjezbaId)")
    public long createEmpty(int korisnikVjezbaId);
}