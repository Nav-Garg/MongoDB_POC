package org.collins.rest.restPrac12.repository;

import java.util.Objects;

import org.collins.rest.restPrac12.model.Car;
import org.collins.rest.restPrac12.model.DbSequence;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Undertow.Options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class SequenceGeneratorService {
	
	private MongoOperations mongoOperations;
	// @Autowired
    public SequenceGeneratorService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public long generateSequence(String seqName) {

        DbSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
                new Update().inc("seq",1), options().returnNew(true).upsert(true),
                DbSequence.class);
        return !Objects.isNull(counter) ? counter.getSeq() : 1;

    }
}
