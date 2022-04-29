package beak;

import java.util.Stack;

// 문제 : https://programmers.co.kr/learn/courses/30/lessons/64061
class Solution {
	public static int solution(int[][] board, int[] moves) {
		System.out.println(moves.length);
		int answer = 0;
		Stack<Integer> list = new Stack<>();
		if (board.length >= 5 && board.length <= 30 && moves.length >= 1 && moves.length <= 1000) {
			for (int i = 0; i < moves.length; i++) {
				int num = moves[i] - 1;

				for (int k = 0; k < board.length; k++) {
					if (board[k][num] != 0) {
						if (list.empty()==false) {
							if (list.peek() == board[k][num]) {
								answer += 2;
								list.pop();
								board[k][num] = 0;
								break;
							}
						}
						list.push(board[k][num]);
						board[k][num] = 0;
						break;
					}

				}
				System.out.println(list);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 0, 0, 2, 2, 2 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },{ 3, 5, 1, 3, 1 } }
		,new int[] {5, 3, 5, 1, 2, 1, 4 }));
	}
}

//int[][] board = { { 0, 0, 2, 2, 2 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
//		{ 3, 5, 1, 3, 1 } };
//int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };