package com.probarnocuestanada.chess.chesslab03.core;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pablo Ezequiel on 15/6/16.
 * <p/>
 * ProbarNoCuestaNada.com
 * <p/>
 * https://github.com/PabloEzequiel
 * https://javaen.blogspot.com
 */
public class ChessSolutions {

    public static String TAG = ChessSolutions.class.getSimpleName();

    private static Map<String, String> chessProblems;
    private static Map<String, String> chessProblems_utf8;

    private ChessSolutions() {}

    /**
     * @return getInstance()
     */
    public static Map getInstance() {

        if( chessProblems == null ) {

            chessProblems      = new HashMap<String, String>();
            chessProblems_utf8 = new HashMap<String, String>();

            init();
        }


        return chessProblems_utf8;
    }

    private static void init() {

        initUTF8();
        initNormal();
    }

    private static void initUTF8() {

        Log.d(TAG, "initUTF8(): ");

        /*
                Black
                ♜	♞	♝	♛	♚	♝	♞	♜
                ♟	♟	♟	♟	♟	♟	♟	♟

                ♙	♙	♙	♙	♙	♙	♙	♙
                ♖	♘	♗	♕	♔	♗	♘	♖
                white
        */

        chessProblems_utf8.put("chess_mate1_00000","1. ♖g8#        ");
        chessProblems_utf8.put("chess_mate1_00001","1. ♘d7#        ");
        chessProblems_utf8.put("chess_mate1_00002","1. dxe8=♘#     ");
        chessProblems_utf8.put("chess_mate1_00003","1. fxg8=♘#     ");
        chessProblems_utf8.put("chess_mate1_00004","1. f8=♕#       ");
        chessProblems_utf8.put("chess_mate1_00005","1. ♘g6#        ");
        chessProblems_utf8.put("chess_mate1_00006","1. ♘d6#        ");
        chessProblems_utf8.put("chess_mate1_00007","1. ♖d8#        ");
        chessProblems_utf8.put("chess_mate1_00008","1. f3#         ");

        chessProblems_utf8.put("chess_mate2_00000","1. ♕b8+ ♞xb8 2. ♖f8#        ");
        chessProblems_utf8.put("chess_mate2_00001","1. ♕xa7+ ♚xa7 2. ♖a3#        ");
        chessProblems_utf8.put("chess_mate2_00002","1. ♖xc6+ bxc6 2. ♗a6#        ");
        chessProblems_utf8.put("chess_mate2_00003","1. ♕xc6+ bxc6 2. ♗a6#        ");
        chessProblems_utf8.put("chess_mate2_00004","1. ♘b5+ cxb5 2. ♘b7#        ");
        chessProblems_utf8.put("chess_mate2_00005","1. ♕f6 ♛xf6 2. ♖xe8#        ");
        chessProblems_utf8.put("chess_mate2_00006","1. ♕xf7+ ♚xf7 2. ♗xe6#        ");
        chessProblems_utf8.put("chess_mate2_00007","1. ♕f6 exf6 2. ♖xe8#        ");
        chessProblems_utf8.put("chess_mate2_00008","1. ♕xf8+ ♛xf8 2. ♖xh7#        ");
        chessProblems_utf8.put("chess_mate2_00009","1. ♕g7+ ♞xg7 2. ♘h6#        ");
        chessProblems_utf8.put("chess_mate2_00010","1. ♕e6+ ♞xe6 2. ♘h6#        ");
        chessProblems_utf8.put("chess_mate2_00011","1. ♕h6+ ♚xh6 2. ♗f8#        ");

        chessProblems_utf8.put("chess_mate3_00000","1. ♕g6 fxg6 2. ♖xg7+ ♚f8 3. ♘xg6#        ");
        chessProblems_utf8.put("chess_mate3_00001","1. ♕d8+ ♚xd8 2. ♘c6+ ♚e8 3. ♖d8#        ");
        chessProblems_utf8.put("chess_mate3_00002","1. ♖g6+ fxg6 2. ♕h8+ ♚xh8 3. ♖xf8#        ");
        chessProblems_utf8.put("chess_mate3_00003","1. ♘e7+ ♚h8 2. ♖xh7+ ♚xh7 3. ♖h1#        ");
        chessProblems_utf8.put("chess_mate3_00004","1. ♕h6+ ♝xh6 2. ♘g5+ ♚h8 3. ♖h7#        ");
        chessProblems_utf8.put("chess_mate3_00005","1. ♖h8+ ♝xh8 2. ♕h7+ ♚f8 3. ♕xh8#        ");
        chessProblems_utf8.put("chess_mate3_00006","1. ♘f6+ ♝xf6 2. ♕xg6+ ♝g7 3. ♕h7#        ");
        chessProblems_utf8.put("chess_mate3_00007","1. ♕d8+ ♚xd8 2. ♗g5+ ♚e8 3. ♖d8#        ");
        chessProblems_utf8.put("chess_mate3_00008","1. ♕xh4+ ♚xh4 2. ♖h7+ ♚g5 3. h4#        ");
        chessProblems_utf8.put("chess_mate3_00009","1. ♘xh7+ ♜xh7 2. ♕h6+ ♜xh6 3. ♗xh6#        ");
        chessProblems_utf8.put("chess_mate3_00010","1. ♕xd4 ♞xd4 2. ♘f6+ ♚f8 3. ♗h6#        ");
        chessProblems_utf8.put("chess_mate3_00011","1. ♕h6 ♛xe5 2. ♕xh7+ ♚xh7 3. ♚g2#        ");
        chessProblems_utf8.put("chess_mate3_00012","1. ♘c7+ ♛xc7 2. ♕xf7+ ♝xf7 3. ♗xf7#        ");
        chessProblems_utf8.put("chess_mate3_00013","1. ♕g7+ ♜xg7 2. hxg7+ ♚g8 3. ♖h8#        ");
        chessProblems_utf8.put("chess_mate3_00014","1. ♕xh7+ ♞xh7 2. ♗xh7+ ♚f8 3. ♘g6#        ");
        chessProblems_utf8.put("chess_mate3_00015","1. ♗xb7+ ♚xb7 2. ♕xb5+ ♚c8 3. ♕c6#        ");
        chessProblems_utf8.put("chess_mate3_00016","1. ♖h7+ ♚xh7 2. ♕h2+ ♚g7 3. ♕h6#        ");

        chessProblems_utf8.put("chess_mate4_00000","1. g4+ fxg4+ 2. ♘xg4+ g5 3. ♕e8+ ♛g6 4. ♘f6#        ");
        chessProblems_utf8.put("chess_mate4_00001","1. ♕xh7+ ♚xh7 2. ♖h3+ ♝xh3 3. ♖xh3+ ♚g6 4. ♖h6#     ");
        chessProblems_utf8.put("chess_mate4_00002","1. ♕xe5+ ♞xe5 2. ♗f6+ ♚h6 3. ♗g7+ ♚h5 4. ♖h6#       ");
        chessProblems_utf8.put("chess_mate4_00003","1. ♕d6+ ♚e8 2. ♗d7+ ♚d8 3. ♗xb5+ ♚c8 4. ♗a6#        ");
        chessProblems_utf8.put("chess_mate4_00004","1. ♘g6+ ♚h7 2. ♘f8+ ♚h8 3. ♕h7+ ♜xh7 4. ♘g6#        ");
        chessProblems_utf8.put("chess_mate4_00005","1. ♖xh7+ ♚xh7 2. ♘f8+ ♚g7 3. ♕h7+ ♚xf8 4. ♕f7#      ");
        chessProblems_utf8.put("chess_mate4_00006","1. ♖h7+ ♚xh7 2. ♕e7+ ♜f7 3. ♕xf7+ ♚h6 4. ♕g7#       ");
        chessProblems_utf8.put("chess_mate4_00007","1. ♖xc5+ ♚b6 2. ♕c7+ ♚a7 3. ♖xa5+ Qa6 4. ♗d4#       ");
        chessProblems_utf8.put("chess_mate4_00008","1. ♗h5+ ♞g6 2. ♖xh7 ♜g1+ 3. ♔xg1 ♝xe2 4. ♗xg6#      ");
        chessProblems_utf8.put("chess_mate4_00009","1. ♖f8+ ♞xf8 2. ♕xf8+ ♚e5 3. f4+ ♝xf4 4. gxf4#      ");
        chessProblems_utf8.put("chess_mate4_00010","1. ♘e7+ ♚h8 2. ♘xg6+ Qxg6 3. ♕xf8+ Qg8 4. ♕xg8#     ");
        chessProblems_utf8.put("chess_mate4_00011","1. ♗xh7+ ♚h8 2. ♗g8+ Qh6 3. ♖xh6+ ♝xh6 4. ♕h7#      ");
        chessProblems_utf8.put("chess_mate4_00012","1. ♗f8+ ♜xf8 2. ♖d3 ♝e1 3. ♖h3+ ♝h4 4. ♖xh4#        ");
        chessProblems_utf8.put("chess_mate4_00013","1. ♘g5 ♝xf2+ 2. ♔h1 ♜xa8 3. ♕h7+ ♚f8 4. ♕h8#        ");
        chessProblems_utf8.put("chess_mate4_00014","1. ♖xb8+ ♚a7 2. ♕d4+ ♚xb8 3. ♖e8+ ♚c7 4. ♕d8#       ");
        chessProblems_utf8.put("chess_mate4_00015","1. ♗g5+ ♜f6 2. ♗xf6+ gxf6 3. ♕g7+ ♚e8 4. ♕f7#       ");

    }


    private static void initNormal() {

        Log.d(TAG, "init(): ");

        chessProblems.put("chess_mate1_00000","1. Rg8#        ");
        chessProblems.put("chess_mate1_00001","1. Nd7#        ");
        chessProblems.put("chess_mate1_00002","1. dxe8=N#     ");
        chessProblems.put("chess_mate1_00003","1. fxg8=N#     ");
        chessProblems.put("chess_mate1_00004","1. f8=Q#       ");
        chessProblems.put("chess_mate1_00005","1. Ng6#        ");
        chessProblems.put("chess_mate1_00006","1. Nd6#        ");
        chessProblems.put("chess_mate1_00007","1. Rd8#        ");
        chessProblems.put("chess_mate1_00008","1. f3#         ");
        chessProblems.put("chess_mate2_00000","1. Qb8+ Nxb8 2. Rf8#        ");
        chessProblems.put("chess_mate2_00001","1. Qxa7+ Kxa7 2. Ra3#        ");
        chessProblems.put("chess_mate2_00002","1. Rxc6+ bxc6 2. Ba6#        ");
        chessProblems.put("chess_mate2_00003","1. Qxc6+ bxc6 2. Ba6#        ");
        chessProblems.put("chess_mate2_00004","1. Nb5+ cxb5 2. Nb7#        ");
        chessProblems.put("chess_mate2_00005","1. Qf6 Qxf6 2. Rxe8#        ");
        chessProblems.put("chess_mate2_00006","1. Qxf7+ Kxf7 2. Bxe6#        ");
        chessProblems.put("chess_mate2_00007","1. Qf6 exf6 2. Rxe8#        ");
        chessProblems.put("chess_mate2_00008","1. Qxf8+ Qxf8 2. Rxh7#        ");
        chessProblems.put("chess_mate2_00009","1. Qg7+ Nxg7 2. Nh6#        ");
        chessProblems.put("chess_mate2_00010","1. Qe6+ Nxe6 2. Nh6#        ");
        chessProblems.put("chess_mate2_00011","1. Qh6+ Kxh6 2. Bf8#        ");
        chessProblems.put("chess_mate3_00000","1. Qg6 fxg6 2. Rxg7+ Kf8 3. Nxg6#        ");
        chessProblems.put("chess_mate3_00001","1. Qd8+ Kxd8 2. Nc6+ Ke8 3. Rd8#        ");
        chessProblems.put("chess_mate3_00002","1. Rg6+ fxg6 2. Qh8+ Kxh8 3. Rxf8#        ");
        chessProblems.put("chess_mate3_00003","1. Ne7+ Kh8 2. Rxh7+ Kxh7 3. Rh1#        ");
        chessProblems.put("chess_mate3_00004","1. Qh6+ Bxh6 2. Ng5+ Kh8 3. Rh7#        ");
        chessProblems.put("chess_mate3_00005","1. Rh8+ Bxh8 2. Qh7+ Kf8 3. Qxh8#        ");
        chessProblems.put("chess_mate3_00006","1. Nf6+ Bxf6 2. Qxg6+ Bg7 3. Qh7#        ");
        chessProblems.put("chess_mate3_00007","1. Qd8+ Kxd8 2. Bg5+ Ke8 3. Rd8#        ");
        chessProblems.put("chess_mate3_00008","1. Qxh4+ Kxh4 2. Rh7+ Kg5 3. h4#        ");
        chessProblems.put("chess_mate3_00009","1. Nxh7+ Rxh7 2. Qh6+ Rxh6 3. Bxh6#        ");
        chessProblems.put("chess_mate3_00010","1. Qxd4 Nxd4 2. Nf6+ Kf8 3. Bh6#        ");
        chessProblems.put("chess_mate3_00011","1. Qh6 Qxe5 2. Qxh7+ Kxh7 3. Kg2#        ");
        chessProblems.put("chess_mate3_00012","1. Nc7+ Qxc7 2. Qxf7+ Bxf7 3. Bxf7#        ");
        chessProblems.put("chess_mate3_00013","1. Qg7+ Rxg7 2. hxg7+ Kg8 3. Rh8#        ");
        chessProblems.put("chess_mate3_00014","1. Qxh7+ Nxh7 2. Bxh7+ Kf8 3. Ng6#        ");
        chessProblems.put("chess_mate3_00015","1. Bxb7+ Kxb7 2. Qxb5+ Kc8 3. Qc6#        ");
        chessProblems.put("chess_mate3_00016","1. Rh7+ Kxh7 2. Qh2+ Kg7 3. Qh6#        ");
        chessProblems.put("chess_mate4_00000","1. g4+ fxg4+ 2. Nxg4+ g5 3. Qe8+ Qg6 4. Nf6#        ");
        chessProblems.put("chess_mate4_00001","1. Qxh7+ Kxh7 2. Rh3+ Bxh3 3. Rxh3+ Kg6 4. Rh6#     ");
        chessProblems.put("chess_mate4_00002","1. Qxe5+ Nxe5 2. Bf6+ Kh6 3. Bg7+ Kh5 4. Rh6#       ");

    }

    public static String getSolution(String chessProblem) {

        Log.d(TAG, "getSolution("+chessProblem+"): ");

        String solution = (String) ChessSolutions.getInstance().get(chessProblem);

        Log.d(TAG, "solution("+chessProblem+"): " + solution);

        return solution;
    }



}




