package com.projetveille2quiz

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context): SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "ResultDatabase"
        private const val TABLE_RESULTAT = "Résultats"

        private const val KEY_ID = "id"
        private const val USER_NAME = "username"
        private const val SCORE = "score"
        private const val DIFFICULTY = "difficulté"
    }
    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_RESULTAT_TABLE = ("CREATE TABLE " + TABLE_RESULTAT + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + USER_NAME + " TEXT," + SCORE + " INTEGER,"
                + DIFFICULTY + " TEXT" + ")")
        db?.execSQL(CREATE_RESULTAT_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_RESULTAT)
        onCreate(db)
    }

    fun addResultatQuiz(res: ResultatQuiz): Long {

        val db = this.writableDatabase

        val contentValues = ContentValues()
        contentValues.put(USER_NAME, res.username)
        contentValues.put(SCORE, res.score)
        contentValues.put(DIFFICULTY, res.difficulte)

        val success = db.insert(TABLE_RESULTAT, null, contentValues)

        db.close()
        return success
    }

    fun afficherHistorique(): ArrayList<ResultatQuiz> {

        val resListe: ArrayList<ResultatQuiz> = ArrayList<ResultatQuiz>()

        val selectQuery = "SELECT * FROM " + TABLE_RESULTAT + " ORDER BY " + KEY_ID + " DESC LIMIT 5"

        val db = this.readableDatabase
        var cursor: Cursor? = null

        try {
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLiteException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var id: Int
        var username: String
        var score: Int
        var difficulte: String

        if (cursor.moveToFirst()) {
            do {
                id = cursor.getInt(cursor.getColumnIndexOrThrow(KEY_ID))
                username = cursor.getString(cursor.getColumnIndexOrThrow(USER_NAME))
                score = cursor.getInt(cursor.getColumnIndexOrThrow(SCORE))
                difficulte = cursor.getString(cursor.getColumnIndexOrThrow(DIFFICULTY))

                val res = ResultatQuiz(id = id, username = username, score = score, difficulte = difficulte)
                resListe.add(res)
            } while (cursor.moveToNext())
        }
        return resListe
    }

    fun afficherLeaderboard(): ArrayList<ResultatQuiz> {

        val resListe: ArrayList<ResultatQuiz> = ArrayList<ResultatQuiz>()

        val selectQuery = "SELECT * FROM " + TABLE_RESULTAT + " ORDER BY " + SCORE + " DESC LIMIT 5"

        val db = this.readableDatabase
        var cursor: Cursor? = null

        try {
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLiteException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var id: Int
        var username: String
        var score: Int
        var difficulte: String

        if (cursor.moveToFirst()) {
            do {
                id = cursor.getInt(cursor.getColumnIndexOrThrow(KEY_ID))
                username = cursor.getString(cursor.getColumnIndexOrThrow(USER_NAME))
                score = cursor.getInt(cursor.getColumnIndexOrThrow(SCORE))
                difficulte = cursor.getString(cursor.getColumnIndexOrThrow(DIFFICULTY))

                val res = ResultatQuiz(id = id, username = username, score = score, difficulte = difficulte)
                resListe.add(res)
            } while (cursor.moveToNext())
        }
        return resListe
    }
}