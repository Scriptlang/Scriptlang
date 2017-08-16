/* ScriptlangParserTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. ScriptlangParserTokenManager.java */
                               /** ScriptLangParser Class - BEGIN **/
package com.parser;
import com.parser.nodes.Node_PrimitiveType.PrimitiveType;
import com.parser.nodes.Node_Literal.LiteralType;
import com.parser.nodes.Node_Expression.ExpressionType;

/** Token Manager. */
@SuppressWarnings("unused")public class ScriptlangParserTokenManager implements ScriptlangParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x700660000L) != 0L)
         {
            jjmatchedKind = 35;
            return 21;
         }
         if ((active0 & 0x187f80L) != 0L)
         {
            jjmatchedKind = 35;
            return 60;
         }
         if ((active0 & 0x80018000L) != 0L)
         {
            jjmatchedKind = 35;
            return 18;
         }
         return -1;
      case 1:
         if ((active0 & 0x7007e0000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 1;
            return 21;
         }
         if ((active0 & 0x1f700L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 1;
            return 61;
         }
         if ((active0 & 0x880L) != 0L)
            return 61;
         if ((active0 & 0x80000000L) != 0L)
            return 21;
         return -1;
      case 2:
         if ((active0 & 0x7007e0000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 2;
            return 21;
         }
         if ((active0 & 0x1f700L) != 0L)
            return 61;
         return -1;
      case 3:
         if ((active0 & 0x400260000L) != 0L)
            return 21;
         if ((active0 & 0x300580000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 3;
            return 21;
         }
         return -1;
      case 4:
         if ((active0 & 0x100580000L) != 0L)
            return 21;
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 4;
            return 21;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 64;
         return jjMoveStringLiteralDfa1_0(0x8000000000000L);
      case 37:
         return jjStopAtPos(0, 62);
      case 38:
         jjmatchedKind = 49;
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 40:
         return jjStopAtPos(0, 42);
      case 41:
         return jjStopAtPos(0, 43);
      case 42:
         return jjStopAtPos(0, 60);
      case 43:
         return jjStopAtPos(0, 58);
      case 45:
         return jjStopAtPos(0, 59);
      case 47:
         return jjStopAtPos(0, 61);
      case 58:
         return jjStopAtPos(0, 65);
      case 59:
         return jjStopAtPos(0, 41);
      case 60:
         jjmatchedKind = 52;
         return jjMoveStringLiteralDfa1_0(0x140000000000000L);
      case 61:
         jjmatchedKind = 44;
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 62:
         jjmatchedKind = 53;
         return jjMoveStringLiteralDfa1_0(0x280000000000000L);
      case 94:
         return jjStopAtPos(0, 48);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x600000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x100040000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x80018000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x107800L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x80780L);
      case 123:
         return jjStopAtPos(0, 5);
      case 124:
         jjmatchedKind = 47;
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 125:
         return jjStopAtPos(0, 6);
      case 126:
         return jjStopAtPos(0, 63);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, 0L);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(1, 46);
         break;
      case 49:
         return jjMoveStringLiteralDfa2_0(active0, 0x1100L);
      case 51:
         return jjMoveStringLiteralDfa2_0(active0, 0xa200L);
      case 54:
         return jjMoveStringLiteralDfa2_0(active0, 0x14400L);
      case 56:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(1, 7, 61);
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(1, 11, 61);
         break;
      case 60:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 56);
         break;
      case 61:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         else if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(1, 54);
         else if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(1, 55);
         break;
      case 62:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 110:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(1, 31, 21);
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x180000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 124:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 45);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, 0L);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 50:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 61);
         else if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 61);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 61);
         break;
      case 52:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 61);
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 61);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 61);
         break;
      case 54:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(2, 8, 61);
         else if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 61);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x100040000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x180000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x200400000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 108:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 21);
         break;
      case 109:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 21);
         break;
      case 111:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 21);
         break;
      case 114:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 21);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 122:
         return jjMoveStringLiteralDfa4_0(active0, 0x180000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 101:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 21);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 21);
         break;
      case 115:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 21);
         break;
      case 121:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(4, 22, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(5, 33, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 60;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 61:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     { jjCheckNAdd(21); }
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                     { jjCheckNAdd(1); }
                  }
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     { jjCheckNAdd(21); }
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                     { jjCheckNAdd(1); }
                  }
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     { jjCheckNAdd(21); }
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                     { jjCheckNAdd(1); }
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     { jjCheckNAddStates(0, 7); }
                  }
                  if (curChar == 48)
                     { jjAddStates(8, 9); }
                  if (curChar == 48)
                     { jjCheckNAdd(6); }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  { jjCheckNAdd(1); }
                  break;
               case 5:
                  if (curChar == 48)
                     { jjCheckNAdd(6); }
                  break;
               case 6:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAddStates(10, 13); }
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  { jjCheckNAdd(21); }
                  break;
               case 22:
                  if (curChar == 48)
                     { jjAddStates(8, 9); }
                  break;
               case 24:
                  if ((0x3000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  { jjAddStates(14, 17); }
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjAddStates(18, 21); }
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddStates(0, 7); }
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddStates(22, 25); }
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(44, 45); }
                  break;
               case 45:
                  if (curChar == 46)
                     { jjCheckNAdd(46); }
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  { jjCheckNAddStates(26, 29); }
                  break;
               case 48:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjstateSet[jjnewStateCnt++] = 48;
                  break;
               case 52:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(52, 53); }
                  break;
               case 53:
                  if (curChar == 46)
                     { jjCheckNAdd(54); }
                  break;
               case 54:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  { jjCheckNAddStates(30, 33); }
                  break;
               case 56:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjstateSet[jjnewStateCnt++] = 56;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 61:
               case 21:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  { jjCheckNAdd(21); }
                  break;
               case 18:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     { jjCheckNAdd(21); }
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 60:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     { jjCheckNAdd(21); }
                  }
                  if (curChar == 122)
                     { jjCheckNAdd(1); }
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     { jjCheckNAdd(21); }
                  }
                  if ((0x20024000000000L & l) != 0L)
                     { jjCheckNAdd(1); }
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 14;
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 18;
                  else if (curChar == 105)
                     { jjCheckNAdd(2); }
                  else if (curChar == 117)
                     { jjCheckNAdd(2); }
                  break;
               case 2:
                  if (curChar == 122)
                     { jjCheckNAdd(1); }
                  break;
               case 3:
                  if (curChar == 117)
                     { jjCheckNAdd(2); }
                  break;
               case 4:
                  if (curChar == 105)
                     { jjCheckNAdd(2); }
                  break;
               case 7:
                  if ((0x20024000000000L & l) != 0L)
                     { jjCheckNAdd(8); }
                  break;
               case 9:
                  if (curChar == 122)
                     { jjCheckNAdd(8); }
                  break;
               case 10:
                  if (curChar == 117)
                     { jjCheckNAdd(9); }
                  break;
               case 11:
                  if (curChar == 105)
                     { jjCheckNAdd(9); }
                  break;
               case 12:
                  if (curChar == 101 && kind > 30)
                     kind = 30;
                  break;
               case 13:
                  if (curChar == 117)
                     { jjCheckNAdd(12); }
                  break;
               case 14:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 115)
                     { jjCheckNAdd(12); }
                  break;
               case 17:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 19:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  { jjCheckNAdd(21); }
                  break;
               case 23:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 25:
                  if ((0x20024000000000L & l) != 0L)
                     { jjCheckNAdd(26); }
                  break;
               case 27:
                  if (curChar == 122)
                     { jjCheckNAdd(26); }
                  break;
               case 28:
                  if (curChar == 117)
                     { jjCheckNAdd(27); }
                  break;
               case 29:
                  if (curChar == 105)
                     { jjCheckNAdd(27); }
                  break;
               case 30:
                  if (curChar == 120)
                     { jjCheckNAdd(31); }
                  break;
               case 31:
                  if ((0x7fffffe0000007eL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAddStates(18, 21); }
                  break;
               case 32:
                  if ((0x20024000000000L & l) != 0L)
                     { jjCheckNAdd(33); }
                  break;
               case 34:
                  if (curChar == 122)
                     { jjCheckNAdd(33); }
                  break;
               case 35:
                  if (curChar == 117)
                     { jjCheckNAdd(34); }
                  break;
               case 36:
                  if (curChar == 105)
                     { jjCheckNAdd(34); }
                  break;
               case 39:
                  if ((0x20024000000000L & l) != 0L)
                     { jjCheckNAdd(40); }
                  break;
               case 41:
                  if (curChar == 122)
                     { jjCheckNAdd(40); }
                  break;
               case 42:
                  if (curChar == 117)
                     { jjCheckNAdd(41); }
                  break;
               case 43:
                  if (curChar == 105)
                     { jjCheckNAdd(41); }
                  break;
               case 47:
                  if ((0x20024000000000L & l) != 0L)
                     { jjCheckNAdd(48); }
                  break;
               case 49:
                  if (curChar == 122)
                     { jjCheckNAdd(48); }
                  break;
               case 50:
                  if (curChar == 117)
                     { jjCheckNAdd(49); }
                  break;
               case 51:
                  if (curChar == 105)
                     { jjCheckNAdd(49); }
                  break;
               case 55:
                  if ((0x20024000000000L & l) != 0L)
                     { jjCheckNAdd(56); }
                  break;
               case 57:
                  if (curChar == 122)
                     { jjCheckNAdd(56); }
                  break;
               case 58:
                  if (curChar == 117)
                     { jjCheckNAdd(57); }
                  break;
               case 59:
                  if (curChar == 105)
                     { jjCheckNAdd(57); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 60 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   38, 39, 42, 43, 44, 45, 52, 53, 23, 30, 6, 7, 10, 11, 24, 25, 
   28, 29, 31, 32, 35, 36, 38, 39, 42, 43, 46, 47, 50, 51, 54, 55, 
   58, 59, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\173", "\175", "\165\70", "\165\61\66", 
"\165\63\62", "\165\66\64", "\151\70", "\151\61\66", "\151\63\62", "\151\66\64", 
"\146\63\62", "\146\66\64", "\142\157\157\154", "\143\150\141\162", "\165\163\151\172\145", 
"\151\163\151\172\145", "\141\165\164\157", "\141\162\162\141\171", null, null, null, null, null, null, 
null, null, "\146\156", "\143\154\141\163\163", "\163\164\162\165\143\164", 
"\145\156\165\155", null, null, null, null, null, null, "\73", "\50", "\51", "\75", "\174\174", 
"\46\46", "\174", "\136", "\46", "\75\75", "\41\75", "\74", "\76", "\74\75", "\76\75", 
"\74\74", "\76\76", "\53", "\55", "\52", "\57", "\45", "\176", "\41", "\72", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public ScriptlangParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public ScriptlangParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 60; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfffffe0fffffffe1L, 0x3L, 
};
static final long[] jjtoSkip = {
   0x1eL, 0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[60];
    private final int[] jjstateSet = new int[2 * 60];

    
    protected char curChar;
}
