/**
 * Copyright (c) 2015-2016, Michael Yang 杨福海 (fuhai999@gmail.com).
 *
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jpress.plugin.search.searcher;

import java.io.IOException;
import java.util.List;

import io.jpress.plugin.search.ISearcher;
import io.jpress.plugin.search.SearcherBean;
/**
 * lucence有点重，暂不想实现
 * 二次开发？你来做吧...
 * @author michael
 */
public class LuceneSearcher implements ISearcher{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBean(SearcherBean bean) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBean(String beanId) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBean(SearcherBean bean) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SearcherBean> search(String keyword) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SearcherBean> search(String queryString, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
