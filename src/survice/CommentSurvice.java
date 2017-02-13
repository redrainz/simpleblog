package survice;

import dao.Icommentdao;
import model.Comment;

public class CommentSurvice {
	private Icommentdao commentdao;

	public Icommentdao getCommentdao() {
		return commentdao;
	}

	public void setCommentdao(Icommentdao commentdao) {
		this.commentdao = commentdao;
	}

	public void add(Comment comment){
		commentdao.add(comment);
		
	}
	
	
}
