package com.spring.timecinema.reply.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.timecinema.reply.entity.Reply;
import com.spring.timecinema.reply.mapper.IReplyMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyService implements IReplyService {
    
    private final IReplyMapper mapper;
    
    @Override
    public void registReply(Reply reply) {
        mapper.registReply(reply);
    }
    
    @Override
<<<<<<< HEAD
    public List<Reply> getList(int rowNum) {
        return mapper.getList(rowNum);
    }

=======
    public List<Reply> getList(String movieId) {
        return mapper.getList(movieId);
    }

    @Override
    public void delete(String movieId, int replyNo) {
        mapper.delete(movieId , replyNo);
    }

    public boolean isExist(String movieId, int replyNo) {
        if(mapper.isExist(movieId, replyNo) == 0) return true;
        return false;
    }


>>>>>>> 6c995e625d287d7f89b90edd1f4714102b39054f
}