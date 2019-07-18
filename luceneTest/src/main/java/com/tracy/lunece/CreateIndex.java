package com.tracy.lunece;

import com.sun.xml.internal.bind.api.impl.NameConverter;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.springframework.boot.CommandLineRunner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class CreateIndex implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    }

    public void createIndex() throws IOException {

        Directory directory = FSDirectory.open(new File("classpath:helloworld").toPath());

        StandardAnalyzer analyzer = new StandardAnalyzer();

        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        //创建一个indexwriter对象
        IndexWriter indexWriter = new IndexWriter(directory, config);

        File file = new File("classpath");

        File[] files = file.listFiles();


//        for (File file2 : files) {
//            //创建document对象
//            Document document = new Document();
//
//            //创建field对象，将field添加到document对象中
//
//            //文件名称
//            String fileName = file2.getName();
//            //创建文件名域
//            //第一个参数：域的名称
//            //第二个参数：域的内容
//            //第三个参数：是否存储
//            Field fileNameField = new TextField("fileName", fileName, Field.Store.YES);
//
//            //文件的大小
//            long fileSize  = FileUtils.sizeOf(file2);
//            //文件大小域
//            Field fileSizeField = new LongField("fileSize", fileSize, Field.Store.YES);
//
//            //文件路径
//            String filePath = file2.getPath();
//            //文件路径域（不分析、不索引、只存储）
//            Field filePathField = new StoredField("filePath", filePath);
//
//            //文件内容
//            String fileContent = FileUtils.readFileToString(file2);
//            //String fileContent = FileUtils.readFileToString(file2, "utf-8");
//            //文件内容域
//            Field fileContentField = new TextField("fileContent", fileContent, Field.Store.YES);
//
//            document.add(fileNameField);
//            document.add(fileSizeField);
//            document.add(filePathField);
//            document.add(fileContentField);
//            //使用indexwriter对象将document对象写入索引库，此过程进行索引创建。并将索引和document对象写入索引库。
//            indexWriter.addDocument(document);
//        }
        //关闭IndexWriter对象。





    }
}
