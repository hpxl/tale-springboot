package com.tale.service;

import com.github.pagehelper.PageInfo;
import com.tale.model.Bo.CommentsBo;
import com.tale.model.entity.Comments;

import java.util.List;
import java.util.Map;

/**
 * Created by hpxl on 1/5/18.
 */
public interface CommentsService {

    public List<Comments> queryList(Map<String, Object> map);

    public Comments getCommentById(Integer coid);

    public void delete(Integer coid, Integer cid);

    public void update(Comments comments);

    PageInfo<CommentsBo> getComments(Integer cid, int page, int limit);

    public String insertComment(Comments comments);
}
