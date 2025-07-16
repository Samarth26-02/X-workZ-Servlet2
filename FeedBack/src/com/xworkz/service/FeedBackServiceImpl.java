//feedback service implementation

package com.xworkz.service;

import com.xworkz.dto.FeedBackDTO;
import com.xworkz.repository.FeedBackRepository;
import com.xworkz.repository.FeedBackRepositoryImpl;

public class FeedBackServiceImpl implements FeedBackService{
    @Override
    public String feedbackValidate(FeedBackDTO feedBackDTO) {
        FeedBackRepository feedBackRepository=new FeedBackRepositoryImpl();
        feedBackRepository.ratings(feedBackDTO);

        return "failed";
    }
}
