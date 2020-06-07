package ma.tiwtiw.table.service.impl;

import ma.tiwtiw.core.service.impl.BaseMongoTemplateServiceImpl;
import ma.tiwtiw.table.model.Table;
import ma.tiwtiw.table.service.TableService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class TableServiceImpl extends BaseMongoTemplateServiceImpl<Table, String> implements
    TableService {

  private final MongoTemplate mongoTemplate;

  public TableServiceImpl(MongoTemplate mongoTemplate) {
    super(Table.class);
    this.mongoTemplate = mongoTemplate;
  }

  @Override
  protected MongoTemplate getMongoTemplate() {
    return mongoTemplate;
  }
}
